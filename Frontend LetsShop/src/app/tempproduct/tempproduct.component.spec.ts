import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TempproductComponent } from './tempproduct.component';

describe('TempproductComponent', () => {
  let component: TempproductComponent;
  let fixture: ComponentFixture<TempproductComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TempproductComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(TempproductComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
