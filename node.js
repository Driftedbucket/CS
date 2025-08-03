import React from 'react'
import { GoogleMap, useJsApiLoader } from '@react-google-maps/api';

const containerStyle = {
  width: '400px',
  height: '400px'
};

const center = {
  lat: 22.5649,
  lng: 17.0842
};

function App() {
  const { isLoaded } = useJsApiLoader({
    id: 'google-map-script',
    googleMapsApiKey: "AIzaSyDWKKqsFpaTqvd2V4pb-4yjgYhAqGq1lSg"
  })

  if (!isLoaded) {
    return <skeletonText />
  }
