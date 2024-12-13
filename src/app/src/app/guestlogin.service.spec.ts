import { TestBed } from '@angular/core/testing';
import { GuestloginService } from './guestlogin.service';

describe('GuestloginService', () => {
  let service: GuestloginService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(GuestloginService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});