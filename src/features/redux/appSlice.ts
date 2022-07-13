import { createSlice, PayloadAction } from "@reduxjs/toolkit";
import { RootState } from "./store";

export type AppState = {
  allPlanets: Planet[];
  filteredPlanets: Planet[];
};

export interface Planet {
  id: string;
  planetName: string;
  hostname: string;
  defaultFlag: string;
  sySnum: string;
  syPnum: string;
  discoverymethod: string;
  discoveryYear: string;
  discoveryFacility: string;
  soltype: string;
  plControvFlag: string;
  plRefname: string;
  plOrbper: string;
  plOrbpererr1: string;
  plOrbpererr2: string;
  plOrbperlim: string;
  plOrbsmax: string;
  plOrbsmaxerr1: string;
  plOrbsmaxerr2: string;
  plOrbsmaxlim: string;
  plRade: string;
  plRadeerr1: string;
  plRadeerr2: string;
  plRadelim: string;
  plRadj: string;
  plRadjerr1: string;
  plRadjerr2: string;
  plRadjlim: string;
  plBmasse: string;
  plBmasseerr1: string;
  plBmasseerr2: string;
  plBmasselim: string;
  plBmassj: string;
  plBmassjerr1: string;
  plBmassjerr2: string;
  plBmassjlim: string;
  plBmassprov: string;
  plOrbeccen: string;
  plOrbeccenerr1: string;
  plOrbeccenerr2: string;
  plOrbeccenlim: string;
  plInsol: string;
  plInsolerr1: string;
  plInsolerr2: string;
  plInsollim: string;
  plEqt: string;
  plEqterr1: string;
  plEqterr2: string;
  plEqtlim: string;
  ttvFlag: string;
  stRefname: string;
  stSpectype: string;
  stTeff: string;
  stTefferr1: string;
  stTefferr2: string;
  stTefflim: string;
  stRad: string;
  stRaderr1: string;
  stRaderr2: string;
  stRadlim: string;
  stMass: string;
  stMasserr1: string;
  stMasserr2: string;
  stMasslim: string;
  stMet: string;
  stMeterr1: string;
  stMeterr2: string;
  stMetlim: string;
  stMetratio: string;
  stLogg: string;
  stLoggerr1: string;
  stLoggerr2: string;
  stLogglim: string;
  syRefname: string;
  rastr: string;
  ra: string;
  decstr: string;
  dec: string;
  syDist: string;
  syDisterr1: string;
  syDisterr2: string;
  syVmag: string;
  syVmagerr1: string;
  syVmagerr2: string;
  syKmag: string;
  syKmagerr1: string;
  syKmagerr2: string;
  syGaiamag: string;
  syGaiamagerr1: string;
  syGaiamagerr2: string;
  rowupdate: string;
  plPubdate: string;
  releasedate: string;
}
const initialState: AppState = {
  allPlanets: [],
  filteredPlanets: [],
};

export const slice = createSlice({
  name: "app",
  initialState: initialState,
  reducers: {
    setAllPlanets: (state, action: PayloadAction<Planet[]>) => {
      state.allPlanets = action.payload;
    },
    setFilteredPlanets: (state, action: PayloadAction<Planet[]>) => {
      state.filteredPlanets = action.payload;
    },
  },
});

export type ReducerActions = typeof slice.actions;
export type ReducerState = ReturnType<typeof slice.reducer>;

export const actions = {
  ...slice.actions,
};

export const getState = (state: RootState): ReducerState => state.app;
export const reducer = slice.reducer;
