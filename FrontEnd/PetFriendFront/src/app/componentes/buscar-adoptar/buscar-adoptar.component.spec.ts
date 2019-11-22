import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BuscarAdoptarComponent } from './buscar-adoptar.component';

describe('BuscarAdoptarComponent', () => {
  let component: BuscarAdoptarComponent;
  let fixture: ComponentFixture<BuscarAdoptarComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BuscarAdoptarComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BuscarAdoptarComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
