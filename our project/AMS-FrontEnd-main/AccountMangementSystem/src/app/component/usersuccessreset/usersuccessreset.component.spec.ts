import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UsersuccessresetComponent } from './usersuccessreset.component';

describe('UsersuccessresetComponent', () => {
  let component: UsersuccessresetComponent;
  let fixture: ComponentFixture<UsersuccessresetComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ UsersuccessresetComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(UsersuccessresetComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
