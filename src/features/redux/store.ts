import { configureStore } from "@reduxjs/toolkit";
import { planetApi } from "../services/apiService";
import * as appSlice from "./appSlice";

export const store = configureStore({
  reducer: {
    app: appSlice.reducer,
    [planetApi.reducerPath]: planetApi.reducer,
  },
  middleware: (getDefaultMiddleware) =>
    getDefaultMiddleware().concat(planetApi.middleware),
});

export const actions = {
  ...appSlice.actions,
};

export type AppDispatch = typeof store.dispatch;
export type RootState = ReturnType<typeof store.getState>;
