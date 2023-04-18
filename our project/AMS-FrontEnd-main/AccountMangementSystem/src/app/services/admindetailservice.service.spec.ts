import { TestBed } from '@angular/core/testing';

import { AdmindetailserviceService } from './admindetailservice.service';

describe('AdmindetailserviceService', () => {
  let service: AdmindetailserviceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(AdmindetailserviceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
