import dayjs from 'dayjs/esm';

import { IJobHistory, NewJobHistory } from './job-history.model';

export const sampleWithRequiredData: IJobHistory = {
  id: 16459,
};

export const sampleWithPartialData: IJobHistory = {
  id: 31185,
  language: 'SPANISH',
};

export const sampleWithFullData: IJobHistory = {
  id: 26932,
  startDate: dayjs('2025-02-13T14:31'),
  endDate: dayjs('2025-02-13T18:59'),
  language: 'ENGLISH',
};

export const sampleWithNewData: NewJobHistory = {
  id: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
