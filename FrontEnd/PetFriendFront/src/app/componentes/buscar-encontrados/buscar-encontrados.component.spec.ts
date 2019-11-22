import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BuscarEncontradosComponent } from './buscar-encontrados.component';

describe('BuscarEncontradosComponent', () => {
  let component: BuscarEncontradosComponent;
  let fixture: ComponentFixture<BuscarEncontradosComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BuscarEncontradosComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BuscarEncontradosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
