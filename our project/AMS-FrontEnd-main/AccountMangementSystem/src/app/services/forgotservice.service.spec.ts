import { TestBed } from '@angular/core/testing';

import { ForgotserviceService } from './forgotservice.service';

describe('ForgotserviceService', () => {
  let service: ForgotserviceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ForgotserviceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
