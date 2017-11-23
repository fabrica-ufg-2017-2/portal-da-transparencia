import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

import { Observable } from 'rxjs/Observable';

import { environment } from './../../../environments/environment';
import { Portaria } from './../models/portaria.interface';

@Injectable()
export class PortariasService {
  private static readonly ENDPONIT = `${environment.api_url}/portarias`;

  constructor(private http: HttpClient) { }

  getAll(): Observable<Array<Portaria>> {
    return this.http.get<Array<Portaria>>(PortariasService.ENDPONIT);
  }
}
