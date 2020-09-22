import {Injectable} from '@angular/core';
import {BehaviorSubject} from 'rxjs';

export interface IMenuItem {
    id?: string;
    title?: string;
    description?: string;
    type: string;       // Possible values: link/dropDown/extLink
    name?: string;      // Used as display text for item and title for separator type
    state?: string;     // Router state
    icon?: string;      // Material icon name
    tooltip?: string;   // Tooltip text
    disabled?: boolean; // If true, item will not be appeared in sidenav.
    sub?: IChildItem[]; // Dropdown items
    badges?: IBadge[];
    active?: boolean;
}

export interface IChildItem {
    id?: string;
    parentId?: string;
    type?: string;
    name: string;       // Display text
    state?: string;     // Router state
    icon?: string;
    sub?: IChildItem[];
    active?: boolean;
}

interface IBadge {
    color: string;      // primary/accent/warn/hex color codes(#fff000)
    value: string;      // Display text
}

interface ISidebarState {
    sidenavOpen?: boolean;
    childnavOpen?: boolean;
}

@Injectable({
    providedIn: 'root'
})
export class NavigationService {
    public sidebarState: ISidebarState = {
        sidenavOpen: true,
        childnavOpen: false
    };
    defaultMenu: IMenuItem[] = [
        {
            name: 'لوحة المستودعات',
            description: '',
            type: 'link',
            icon: 'i-Dashboard',
            state: '/dashboard/v1'
        },
        {
            name: ' البيانات الأساسية',
            description: 'البيانات الأساسية',
            type: 'dropDown',
            icon: 'i-Data-Settings',
            sub: [
                {name: 'تعريف الوحدات', state: '/units', type: 'link'},
                {name: 'تعريف المستودع', state: '/inbox', type: 'link'},
                {name: 'تعريف الأصناف', state: '/chat', type: 'link'},
            ]
        },
        {
            name: ' الحركات المخزنية',
            description: 'الحركات المخزنية',
            type: 'dropDown',
            icon: 'i-Split-Horizontal-2-Window',
            sub: [
                {name: 'إستلام أصناف "مذكرة إستلام"', state: '/invoice', type: 'link'},
                {name: 'صرف أصناف "أمر صرف"', state: '/inbox', type: 'link'},
            ]
        },
        {
            name: ' أعمال الجرد',
            description: 'أعمال الجرد',
            type: 'dropDown',
            icon: 'i-Safe-Box1',
            sub: [
                {name: 'إعداد الأصناف للجرد', state: '/invoice', type: 'link'},
                {name: 'إدخال نتائج الجرد', state: '/inbox', type: 'link'},
            ]
        },
        {
            name: 'تقارير',
            description: 'خدمة التقارير',
            type: 'dropDown',
            icon: 'i-Newspaper',
             sub: [
                {name: 'بطاقة الصنف', state: '/invoice', type: 'link'},
                {name: 'أرصدة الأصناف', state: '/inbox', type: 'link'},
             ]
        },
    ];
    // sets iconMenu as default;
    menuItems = new BehaviorSubject<IMenuItem[]>(this.defaultMenu);
    // navigation component has subscribed to this Observable
    menuItems$ = this.menuItems.asObservable();

    constructor() {
    }

    // You can customize this method to supply different menu for
    // different user type.
    // publishNavigationChange(menuType: string) {
    //   switch (userType) {
    //     case 'admin':
    //       this.menuItems.next(this.adminMenu);
    //       break;
    //     case 'user':
    //       this.menuItems.next(this.userMenu);
    //       break;
    //     default:
    //       this.menuItems.next(this.defaultMenu);
    //   }
    // }
}
