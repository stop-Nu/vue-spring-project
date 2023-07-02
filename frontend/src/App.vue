<!-- vue.js의 가장 초기화면 App.vue -->
<template>
  <div id = "app"> 
      <MainMap/>
  </div>
</template>

<script>
import MainMap from '@/components/MainMap'

export default { 
  name : 'App',
  components : {
      MainMap
  }
}
</script>

<style>
#app{
  position : absolute;
  top : 0;
  right : 0;
  bottom : 0;
  left : 0;
}
</style>