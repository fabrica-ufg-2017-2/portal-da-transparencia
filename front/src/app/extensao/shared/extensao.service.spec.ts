import { TestBed, inject } from '@angular/core/testing';

import { ExtensaoService } from './extensao.service';

describe('ExtensaoService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [ExtensaoService]
    });
  });

  it('should be created', inject([ExtensaoService], (service: ExtensaoService) => {
    expect(service).toBeTruthy();
  }));
});
