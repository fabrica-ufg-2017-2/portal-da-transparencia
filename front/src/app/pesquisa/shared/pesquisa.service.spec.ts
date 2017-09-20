import { TestBed, inject } from '@angular/core/testing';

import { PesquisaService } from './pesquisa.service';

describe('PesquisaService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [PesquisaService]
    });
  });

  it('should be created', inject([PesquisaService], (service: PesquisaService) => {
    expect(service).toBeTruthy();
  }));
});
