import { TestBed } from '@angular/core/testing';

import { WithdrawdetailserviceService } from './withdrawdetailservice.service';

describe('WithdrawdetailserviceService', () => {
  let service: WithdrawdetailserviceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(WithdrawdetailserviceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
