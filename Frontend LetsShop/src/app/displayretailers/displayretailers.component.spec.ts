import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DisplayretailersComponent } from './displayretailers.component';

describe('DisplayretailersComponent', () => {
  let component: DisplayretailersComponent;
  let fixture: ComponentFixture<DisplayretailersComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DisplayretailersComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(DisplayretailersComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
