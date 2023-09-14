import {Route, RouterModule, Routes} from '@angular/router';
import {NgModule} from '@angular/core';
import {StudentComponent} from './components/student/student.component';
import {AddStudentComponent} from './components/add-student/add-student.component';

const routes: Routes =[
  {path:'student',component:StudentComponent},
  {path:'add-student',component:AddStudentComponent},
  {path:'',redirectTo:'student', pathMatch:'full'}
];

@NgModule({
  imports:[RouterModule.forRoot(routes)],
  exports:[RouterModule]
})

export class AppRoutingModule{}
