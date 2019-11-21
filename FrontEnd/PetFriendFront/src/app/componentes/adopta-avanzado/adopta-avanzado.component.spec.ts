import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AdoptaAvanzadoComponent } from './adopta-avanzado.component';

describe('AdoptaAvanzadoComponent', () => {
  let component: AdoptaAvanzadoComponent;
  let fixture: ComponentFixture<AdoptaAvanzadoComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AdoptaAvanzadoComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AdoptaAvanzadoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
