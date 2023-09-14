import { Component, OnInit } from '@angular/core';
import { MatDialogRef } from '@angular/material/dialog';

@Component({
  selector: 'app-dialog',
  templateUrl: './dialog.component.html',
  styleUrls: ['./dialog.component.css']
})
export class DialogComponent implements OnInit {
  selectedValue: string = 'Name'; // Default selection
  searchValue: string = '';

  constructor(public dialogRef: MatDialogRef<DialogComponent>) { }

  ngOnInit(): void {
  }

  search() {
    this.dialogRef.close({ selectedValue: this.selectedValue, searchValue: this.searchValue });
  }

  cancel() {
    this.dialogRef.close()
  }
}
