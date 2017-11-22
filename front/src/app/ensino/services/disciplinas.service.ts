import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { environment } from '../../../environments/environment';
import { Disciplina } from '../models/disciplina.model';
import { Observable } from 'rxjs/Observable';

@Injectable()
export class DisciplinasService {
  constructor(private http: HttpClient) {}

  buscarDisciplinas(): Observable<Disciplina[]> {
    return this.http.get<Disciplina[]>(`${environment.api.url}/disciplinas`);
  }
}
