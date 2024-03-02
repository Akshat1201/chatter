import "./App.css";
import MainSpace from "./components/MainSpace";
import SideSpace from "./components/SideSpace";

function App() {
  return (
    <div className="flex w-full h-screen">
        <SideSpace />
        <MainSpace />
    </div>
  );
}

export default App;
