import React from "react";

const ProfileCard = (props) => {
  function cardClicked(e) {
    console.log("card clicked ",e);
  }
  function imageClicked(e) {
    e.stopPropagation()
    console.log("image clicked ",e);
  }
  return (
    <div className="bg-purple-500 h-16 border-solid border-b-2 border-black  flex pl-2 py-px" onClick={cardClicked}>
      <div className="border-solid border-black border-2 rounded-full overflow-hidden w-1/5" onClick={imageClicked}>
        <img src="https://www.w3schools.com/howto/img_avatar2.png" />
      </div>
      <div className="flex items-center pl-2">{props.friend.name}</div>
    </div>
  );
};
export default ProfileCard;
