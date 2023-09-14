import { Component, OnInit } from '@angular/core';
import { Students } from '../../students';
import { StudentService } from '../../services/student.service';
import { HttpErrorResponse } from '@angular/common/http';
import { MatDialog } from '@angular/material/dialog';
import { DialogComponent } from '../dialog/dialog.component';

@Component({
  selector: 'app-student',
  templateUrl: './student.component.html',
  styleUrls: ['./student.component.css']
})
export class StudentComponent implements OnInit {
  students: Students[] = [];
  filteredStudents: Students[] = [];
  filterCriteria = '';

  constructor(
    private studentService: StudentService,
    public dialog: MatDialog
  ) {}

  ngOnInit() {
    this.getStudent();
  }

  public getStudent(): void {
    this.studentService.getStudents().subscribe(
      (response: Students[]) => {
        this.students = response;
        this.filteredStudents = [...this.students];
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      }
    );
  }

  openDialog() {
    const dialogRef = this.dialog.open(DialogComponent, {
      height: '300px',
      width: '500px'
    });

    dialogRef.afterClosed().subscribe(result => {
      if (result) {
        this.filterStudents(result.selectedValue, result.searchValue);
      } else {
        this.resetFilters();
      }
    });
  }

  filterStudents(selectedValue: string, searchValue: string) {
    this.filteredStudents = this.students.filter(student => {
      if (selectedValue === 'Name' && searchValue) {
        return student.name.toLowerCase().includes(searchValue.toLowerCase().trim());
      } else if (selectedValue === 'Address' && searchValue) {
        return student.address.toLowerCase().includes(searchValue.toLowerCase().trim());
      }
      return false;
    });
    this.filterCriteria = selectedValue;
  }


  resetFilters() {
    this.filteredStudents = [...this.students];
    this.filterCriteria ='';
  }
}
