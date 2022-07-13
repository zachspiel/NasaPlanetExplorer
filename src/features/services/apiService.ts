import { createApi, fetchBaseQuery } from "@reduxjs/toolkit/query/react";
import { Planet } from "../redux/appSlice";

export interface AllPlanetsResponse {
  content: Planet[];
  totalElements: number;
  totalPages: number;
  size: number;
}

export const planetApi = createApi({
  reducerPath: "planetApi",
  baseQuery: fetchBaseQuery({ baseUrl: "http://localhost:5000" }),
  endpoints: (builder) => ({
    getPlanetByName: builder.query<Planet, string>({
      query: (name) => `planets/${name}`,
    }),

    getAllPlanets: builder.query<AllPlanetsResponse, void>({
      query: () => "planets?limit=33000",
    }),
    filterPlanets: builder.query<
      any,
      {
        hostname?: string;
        discoveryYear?: string;
        discoveryFacility?: string;
        discoveryMethod?: string;
        page: number;
        limit: number;
      }
    >({
      query: (arg) => {
        const {
          hostname,
          discoveryYear,
          discoveryMethod,
          discoveryFacility,
          page,
          limit,
        } = arg;
        return {
          url: "filterPlanets/",
          params: {
            hostname,
            discoveryYear,
            discoveryMethod,
            discoveryFacility,
            page,
            limit,
          },
        };
      },
    }),
  }),
});

export const { useGetPlanetByNameQuery, useGetAllPlanetsQuery } = planetApi;
