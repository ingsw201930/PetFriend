import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EncontrarAvanzadoComponent } from './encontrar-avanzado.component';

describe('EncontrarAvanzadoComponent', () => {
  let component: EncontrarAvanzadoComponent;
  let fixture: ComponentFixture<EncontrarAvanzadoComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EncontrarAvanzadoComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EncontrarAvanzadoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
