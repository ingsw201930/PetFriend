import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EncontrarBasicoComponent } from './encontrar-basico.component';

describe('EncontrarBasicoComponent', () => {
  let component: EncontrarBasicoComponent;
  let fixture: ComponentFixture<EncontrarBasicoComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EncontrarBasicoComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EncontrarBasicoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
