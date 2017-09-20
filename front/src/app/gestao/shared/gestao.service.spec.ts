import { TestBed, inject } from '@angular/core/testing';

import { GestaoService } from './gestao.service';

describe('GestaoService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [GestaoService]
    });
  });

  it('should be created', inject([GestaoService], (service: GestaoService) => {
    expect(service).toBeTruthy();
  }));
});
