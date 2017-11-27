import { TestBed, inject } from '@angular/core/testing';

import { PortariasService } from './portarias.service';

describe('PortariasService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [PortariasService]
    });
  });

  it('should be created', inject([PortariasService], (service: PortariasService) => {
    expect(service).toBeTruthy();
  }));
});
