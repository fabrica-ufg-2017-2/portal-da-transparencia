import { TestBed, inject } from '@angular/core/testing';

import { ProjetosService } from './projetos.service';

describe('ProjetosService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [ProjetosService]
    });
  });

  it(
    'should be created',
    inject([ProjetosService], (service: ProjetosService) => {
      expect(service).toBeTruthy();
    })
  );
});
