import { TestBed } from '@angular/core/testing';

import { DepositdetailserviceService } from './depositdetailservice.service';

describe('DepositdetailserviceService', () => {
  let service: DepositdetailserviceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(DepositdetailserviceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
