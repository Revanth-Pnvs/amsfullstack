import { TestBed } from '@angular/core/testing';

import { CheckbalanceserviceService } from './checkbalanceservice.service';

describe('CheckbalanceserviceService', () => {
  let service: CheckbalanceserviceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(CheckbalanceserviceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
