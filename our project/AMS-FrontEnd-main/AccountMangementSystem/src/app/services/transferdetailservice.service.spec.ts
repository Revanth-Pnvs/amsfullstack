import { TestBed } from '@angular/core/testing';

import { TransferdetailserviceService } from './transferdetailservice.service';

describe('TransferdetailserviceService', () => {
  let service: TransferdetailserviceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(TransferdetailserviceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
