import { TestBed, inject } from '@angular/core/testing';

import { DisciplinasService } from './disciplinas.service';

describe('DisciplinasService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [DisciplinasService]
    });
  });

  it(
    'should be created',
    inject([DisciplinasService], (service: DisciplinasService) => {
      expect(service).toBeTruthy();
    })
  );
});
