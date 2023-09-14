import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Students} from '../students';
import {environment} from '../../environments/environment';

@Injectable({
  providedIn: 'root'
})
export class StudentService {

  private apiServerUrl = environment.apiBaseUrl;
  constructor(private http: HttpClient) { }

  public getStudents(): Observable<Students[]> {
    return this.http.get<Students[]>(`${this.apiServerUrl}/student/all`);
  }

  public addStudent(student: Students): Observable<any> {
    return this.http.post(`${this.apiServerUrl}/student/add`,student);
  }
}
