import {EventEmitter, Injectable} from "@angular/core";
import { HttpClient } from '@angular/common/http';
import {Task} from './task.model';


@Injectable({
  providedIn: 'root'
})
export class TaskService {

  public RESOURCE_URL = 'api/tasks';

  onTaskAdded = new EventEmitter<Task>();

  constructor(private http: HttpClient) {
  }

  getTasks() {
    return this.http.get(this.RESOURCE_URL);
  }

  saveTask(task: Task, checked: boolean) {
    task.completed = checked;
    return this.http.post(this.RESOURCE_URL + "/save", task);
  }

  addTask(task: Task) {
    return this.http.post(this.RESOURCE_URL + "/save", task);
  }

}
