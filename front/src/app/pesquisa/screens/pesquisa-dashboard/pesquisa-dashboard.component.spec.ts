import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PesquisaDashboardComponent } from './pesquisa-dashboard.component';

describe('PesquisaDashboardComponent', () => {
  let component: PesquisaDashboardComponent;
  let fixture: ComponentFixture<PesquisaDashboardComponent>;

  beforeEach(
    async(() => {
      TestBed.configureTestingModule({
        declarations: [PesquisaDashboardComponent]
      }).compileComponents();
    })
  );

  beforeEach(() => {
    fixture = TestBed.createComponent(PesquisaDashboardComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});
