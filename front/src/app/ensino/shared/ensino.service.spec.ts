import { TestBed, inject } from '@angular/core/testing';

import { EnsinoService } from './ensino.service';

describe('EnsinoService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [EnsinoService]
    });
  });

  it('should be created', inject([EnsinoService], (service: EnsinoService) => {
    expect(service).toBeTruthy();
  }));
});
