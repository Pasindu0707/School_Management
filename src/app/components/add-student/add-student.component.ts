import { Component, OnInit } from '@angular/core';
import {Students} from '../../students';
import {StudentService} from '../../services/student.service';
import {Router} from '@angular/router';

@Component({
  selector: 'app-add-student',
  templateUrl: './add-student.component.html',
  styleUrls: ['./add-student.component.css']
})
export class AddStudentComponent implements OnInit {
  student: Students = {
    studentID: '', // Initialize with appropriate default values
    name: '',
    contact: '',
    address: '',
    email: ''
  };

  constructor(private studentService:StudentService,
  private router:Router) { }

  ngOnInit(): void {
  }

  addStudent(){
    this.studentService.addStudent(this.student).subscribe(data=>{
      console.log(data)
      this.goToStudentList()
    },
      error => console.log(error));
  }

  goToStudentList(){
    this.router.navigate(['/student']);
  }
  onSubmit() {
      this.addStudent()
  }
}
