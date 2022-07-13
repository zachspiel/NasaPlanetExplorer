import React, { useState } from "react";
import "./App.css";
import { useGetAllPlanetsQuery } from "./features/services/apiService";
import { DataGrid, GridColDef, GridToolbar } from "@mui/x-data-grid";
import { Planet } from "./features/redux/appSlice";
import {
  AppBar,
  Box,
  Button,
  Container,
  CssBaseline,
  IconButton,
  LinearProgress,
  Toolbar,
  Typography,
} from "@mui/material";
import { createTheme, ThemeOptions, ThemeProvider } from "@mui/material/styles";
import GitHubIcon from "@mui/icons-material/GitHub";
import LightModeIcon from "@mui/icons-material/LightMode";
import DarkModeIcon from "@mui/icons-material/DarkMode";
import * as Hooks from "./features/redux/hooks";

interface GleanedPlanet {
  id: string;
  hostname: string;
  discoverymethod: string;
  discoveryYear: string;
  discoveryFacility: string;
}

const light: ThemeOptions = {
  palette: {
    mode: "light",
  },
};

const dark: ThemeOptions = {
  palette: {
    mode: "dark",
  },
};

function App() {
  const state = Hooks.useAppSelector((state) => state.app);
  const [isDarkTheme, setIsDarkTheme] = useState(false);
  const { data, isLoading } = useGetAllPlanetsQuery();
  const [rows, setRows] = React.useState<GleanedPlanet[]>([]);
  const currentYear = new Date().getFullYear();
  const { setAllPlanets } = Hooks.useActions();

  React.useEffect(() => {
    if (data !== undefined) {
      setAllPlanets(data.content);
    }
  }, [data, setAllPlanets]);

  React.useEffect(() => {
    setRows(
      state.allPlanets.map((planet: Planet) => {
        const {
          id,
          hostname,
          discoverymethod,
          discoveryYear,
          discoveryFacility,
          plRade,
          plRadeerr1,
          plRadeerr2,
          plRadelim,
          plRadj,
          plRadjerr1,
          plRadjerr2,
          plRadjlim,
          plInsol,
          plInsolerr1,
          plInsolerr2,
          plInsollim,
          plEqt,
          plEqterr1,
          plEqterr2,
          plEqtlim,
          ...rest
        } = planet;

        return {
          id,
          hostname,
          discoverymethod,
          discoveryYear,
          discoveryFacility,
          ...rest,
        };
      })
    );
  }, [state.allPlanets]);

  const getColumns = (): GridColDef[] => {
    // flex: 20
    if (rows.length > 0) {
      return Object.keys(rows[0]).map((key) => {
        return { field: key, headerName: key, flex: 1, minWidth: 100 };
      });
    }
    return [];
  };

  const getTitle = (): string => {
    if (data !== undefined) {
      return `${data?.totalElements.toLocaleString()} Planets Available`;
    } else {
      return "Planets";
    }
  };

  return (
    <ThemeProvider theme={isDarkTheme ? createTheme(dark) : createTheme(light)}>
      <CssBaseline />
      <Container maxWidth={false} disableGutters>
        <AppBar sx={{ position: "relative" }}>
          <Toolbar>
            <Typography variant="h6" component="div" sx={{ flexGrow: 1 }}>
              NASA Exoplanet Explorer
            </Typography>
            <Box>
              <Button sx={{ color: "#fff" }}>
                <GitHubIcon />
              </Button>
              <IconButton
                aria-label="delete"
                sx={{ color: "#fff" }}
                onClick={() => setIsDarkTheme(!isDarkTheme)}
              >
                {isDarkTheme ? <DarkModeIcon /> : <LightModeIcon />}
              </IconButton>
            </Box>
          </Toolbar>
        </AppBar>
        <Toolbar>
          <Typography
            sx={{ flex: "1 1 100%" }}
            variant="h6"
            id="tableTitle"
            component="div"
          >
            {getTitle()}
          </Typography>
        </Toolbar>
        <div style={{ height: "75vh", width: "100%" }}>
          <div style={{ display: "flex", height: "100%", width: "100%" }}>
            <div style={{ flexGrow: 1 }}>
              <DataGrid
                rows={rows}
                disableSelectionOnClick
                columns={getColumns()}
                components={{
                  Toolbar: GridToolbar,
                  LoadingOverlay: LinearProgress,
                }}
                loading={isLoading}
                initialState={{
                  columns: {
                    columnVisibilityModel: {
                      id: false,
                    },
                  },
                }}
              />
            </div>
          </div>
        </div>
        <Toolbar
          sx={{
            display: "flex",
            justifyContent: "center",
            textAlign: "center",
          }}
        >
          <Typography sx={{ flex: "1 1 100%" }} component="div">
            © {currentYear} Zachary Spielberger. All rights reserved
          </Typography>
        </Toolbar>
      </Container>
    </ThemeProvider>
  );
}

export default App;
