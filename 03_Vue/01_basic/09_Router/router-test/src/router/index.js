import {
  createRouter,
  createWebHistory,
  createWebHashHistory,
} from 'vue-router';
import Home from '@/pages/Home.vue';

/*
네비게이션 가드 (beforeEnter)
- false를 반환하게 되면 접근을 차단함
*/

const membersIdGuard = (to, from) => {
  if (from.name !== 'members' && from.name !== 'members/id') {
    return false;
  }
};

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: Home,
    },
    {
      path: '/members',
      name: 'members',

      // 지연 로딩 : 해당 경로에 처음 접근할 때 컴포넌트를 불러옴
      // 초기 로딩 속도 개선
      component: () => import('@/pages/MemberList.vue'),
    },
    {
      path: '/members/:id',
      name: 'members/id',
      component: () => import('@/pages/MemberInfo.vue'),
      // members에서만 접근해야 상세 정보를 볼 수 있게 설정
      beforeEnter: membersIdGuard,
    },
  ],
});

export default router;
