import { Routes } from '@angular/router';

const routes: Routes = [
  {
    path: 'region',
    data: { pageTitle: 'jhipsterAngularApplicationApp.region.home.title' },
    loadChildren: () => import('./region/region.routes'),
  },
  {
    path: 'country',
    data: { pageTitle: 'jhipsterAngularApplicationApp.country.home.title' },
    loadChildren: () => import('./country/country.routes'),
  },
  {
    path: 'location',
    data: { pageTitle: 'jhipsterAngularApplicationApp.location.home.title' },
    loadChildren: () => import('./location/location.routes'),
  },
  {
    path: 'department',
    data: { pageTitle: 'jhipsterAngularApplicationApp.department.home.title' },
    loadChildren: () => import('./department/department.routes'),
  },
  {
    path: 'task',
    data: { pageTitle: 'jhipsterAngularApplicationApp.task.home.title' },
    loadChildren: () => import('./task/task.routes'),
  },
  {
    path: 'employee',
    data: { pageTitle: 'jhipsterAngularApplicationApp.employee.home.title' },
    loadChildren: () => import('./employee/employee.routes'),
  },
  {
    path: 'job',
    data: { pageTitle: 'jhipsterAngularApplicationApp.job.home.title' },
    loadChildren: () => import('./job/job.routes'),
  },
  {
    path: 'job-history',
    data: { pageTitle: 'jhipsterAngularApplicationApp.jobHistory.home.title' },
    loadChildren: () => import('./job-history/job-history.routes'),
  },
  /* jhipster-needle-add-entity-route - JHipster will add entity modules routes here */
];

export default routes;
