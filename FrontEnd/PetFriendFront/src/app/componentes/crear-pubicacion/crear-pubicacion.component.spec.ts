import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CrearPubicacionComponent } from './crear-pubicacion.component';

describe('CrearPubicacionComponent', () => {
  let component: CrearPubicacionComponent;
  let fixture: ComponentFixture<CrearPubicacionComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CrearPubicacionComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CrearPubicacionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
