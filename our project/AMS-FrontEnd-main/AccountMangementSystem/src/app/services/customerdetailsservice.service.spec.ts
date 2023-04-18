import { TestBed } from '@angular/core/testing';

import { CustomerdetailsserviceService } from './customerdetailsservice.service';

describe('CustomerserviceService', () => {
  let service: CustomerdetailsserviceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(CustomerdetailsserviceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
