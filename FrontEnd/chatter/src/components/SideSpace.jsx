import React, { useEffect, useState } from "react";
import ProfileCard from "./ProfileCard";
import FriendList from '../MockJson/FriendList.json'

const SideSpace = () => {
  const [friendList,setFriendList]=useState([])
  useEffect(()=>{
    console.log("loads on mounting of component");
    setFriendList(FriendList.friendList)
  },[])
  return <div className="bg-red-500 w-1/4 overflow-auto">
    {
      friendList.map( friend => <ProfileCard friend={friend} key={friend.email} />)
    }</div>;
};
export default SideSpace;
