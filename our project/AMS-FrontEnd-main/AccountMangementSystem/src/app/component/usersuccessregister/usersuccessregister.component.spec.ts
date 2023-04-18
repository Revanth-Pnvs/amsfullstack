import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UsersuccessregisterComponent } from './usersuccessregister.component';

describe('UsersuccessregisterComponent', () => {
  let component: UsersuccessregisterComponent;
  let fixture: ComponentFixture<UsersuccessregisterComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ UsersuccessregisterComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(UsersuccessregisterComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
