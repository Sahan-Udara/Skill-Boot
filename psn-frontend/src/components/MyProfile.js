import React, { useEffect, useState } from "react";
import { useDispatch, useSelector } from "react-redux";
import { useNavigate } from "react-router-dom";
import { getProfilePosts } from "../feature/checkProfile/checkProfileSlice";
import { getProfileInfo } from "../feature/checkProfile/checkProfileSlice";
import PostItem from "./PostItem";

function MyProfile() {
  const navigate = useNavigate();
  const dispatch = useDispatch();
  const postList = useSelector((state) => state.checkProfileReducer.postList);
  const userInfo = useSelector((state) => state.checkProfileReducer.profileInfo);

  useEffect(() => {
    if (localStorage.getItem("psnToken") === null) {
      navigate("/unauthorized");
    }

    if (localStorage.getItem("psnUserId") !== null) {
      dispatch(getProfilePosts(localStorage.getItem("psnUserId")));
      dispatch(getProfileInfo(localStorage.getItem("psnUserId")));
    }
  }, [dispatch, navigate]);

  return (
    <div>
      <h1>My Profile</h1>
      {postList && userInfo ? (
        postList.map((postItem) => (
          <PostItem
            key={postItem.id}
            postId={postItem.id}
            userId={postItem.userId}
            firstName={userInfo.firstName}
            lastName={userInfo.lastName}
            content={postItem.content}
            image={postItem.image}
            loveList={postItem.love}
            shareList={postItem.share}
            commentList={postItem.comment}
            postDate={postItem.createdAt}
          />
        ))
      ) : (
        <div>Loading posts...</div>
      )}
    </div>
  );
}

export default MyProfile;
