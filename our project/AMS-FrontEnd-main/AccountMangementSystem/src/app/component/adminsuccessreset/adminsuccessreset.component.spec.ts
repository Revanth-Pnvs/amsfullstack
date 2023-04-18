import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AdminsuccessresetComponent } from './adminsuccessreset.component';

describe('AdminsuccessresetComponent', () => {
  let component: AdminsuccessresetComponent;
  let fixture: ComponentFixture<AdminsuccessresetComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AdminsuccessresetComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AdminsuccessresetComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
