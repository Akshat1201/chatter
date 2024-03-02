import "./App.css";
import MainSpace from "./components/MainSpace";
import SideSpace from "./components/SideSpace";

function App() {
  return (
    <div className="flex">
        <SideSpace />
        <MainSpace />
    </div>
  );
}

export default App;
