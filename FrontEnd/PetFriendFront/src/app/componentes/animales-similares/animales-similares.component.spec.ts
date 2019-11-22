import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AnimalesSimilaresComponent } from './animales-similares.component';

describe('AnimalesSimilaresComponent', () => {
  let component: AnimalesSimilaresComponent;
  let fixture: ComponentFixture<AnimalesSimilaresComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AnimalesSimilaresComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AnimalesSimilaresComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
