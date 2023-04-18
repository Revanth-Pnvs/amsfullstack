import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AdminsuccessregisterComponent } from './adminsuccessregister.component';

describe('AdminsuccessregisterComponent', () => {
  let component: AdminsuccessregisterComponent;
  let fixture: ComponentFixture<AdminsuccessregisterComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AdminsuccessregisterComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AdminsuccessregisterComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
