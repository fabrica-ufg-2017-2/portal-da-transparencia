import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

import { Observable } from 'rxjs/Observable';

import { environment } from './../../../environments/environment';
import { Projeto } from './../models/projeto.interface';

@Injectable()
export class ProjetosService {
  private static readonly ENDPONIT = `${environment.api.url}/extensao/projetos`;

  constructor(private http: HttpClient) {}

  getAll(): Observable<Array<Projeto>> {
    return this.http.get<Array<Projeto>>(ProjetosService.ENDPONIT);
  }
}
