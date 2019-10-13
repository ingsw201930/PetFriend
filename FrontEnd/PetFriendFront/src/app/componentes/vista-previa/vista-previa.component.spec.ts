import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { VistaPreviaComponent } from './vista-previa.component';

describe('VistaPreviaComponent', () => {
  let component: VistaPreviaComponent;
  let fixture: ComponentFixture<VistaPreviaComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ VistaPreviaComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(VistaPreviaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
