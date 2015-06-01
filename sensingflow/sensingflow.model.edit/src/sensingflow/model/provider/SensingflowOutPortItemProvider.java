/**
 */
package sensingflow.model.provider;


import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import sensingflow.model.SensingflowOutPort;
import sensingflow.model.SensingflowPackage;

/**
 * This is the item provider adapter for a {@link sensingflow.model.SensingflowOutPort} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SensingflowOutPortItemProvider extends SensingflowPortItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensingflowOutPortItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addOutputSizePropertyDescriptor(object);
			addThingPropertyDescriptor(object);
			addFrameSizePropertyDescriptor(object);
			addSubFrameSizePropertyDescriptor(object);
			addSubFrameSlidingSizePropertyDescriptor(object);
			addFrameIntervalPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Output Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutputSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SensingflowOutPort_outputSize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SensingflowOutPort_outputSize_feature", "_UI_SensingflowOutPort_type"),
				 SensingflowPackage.Literals.SENSINGFLOW_OUT_PORT__OUTPUT_SIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Thing feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addThingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SensingflowOutPort_thing_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SensingflowOutPort_thing_feature", "_UI_SensingflowOutPort_type"),
				 SensingflowPackage.Literals.SENSINGFLOW_OUT_PORT__THING,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Frame Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFrameSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SensingflowOutPort_frameSize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SensingflowOutPort_frameSize_feature", "_UI_SensingflowOutPort_type"),
				 SensingflowPackage.Literals.SENSINGFLOW_OUT_PORT__FRAME_SIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sub Frame Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubFrameSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SensingflowOutPort_subFrameSize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SensingflowOutPort_subFrameSize_feature", "_UI_SensingflowOutPort_type"),
				 SensingflowPackage.Literals.SENSINGFLOW_OUT_PORT__SUB_FRAME_SIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sub Frame Sliding Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubFrameSlidingSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SensingflowOutPort_subFrameSlidingSize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SensingflowOutPort_subFrameSlidingSize_feature", "_UI_SensingflowOutPort_type"),
				 SensingflowPackage.Literals.SENSINGFLOW_OUT_PORT__SUB_FRAME_SLIDING_SIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Frame Interval feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFrameIntervalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SensingflowOutPort_frameInterval_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SensingflowOutPort_frameInterval_feature", "_UI_SensingflowOutPort_type"),
				 SensingflowPackage.Literals.SENSINGFLOW_OUT_PORT__FRAME_INTERVAL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns SensingflowOutPort.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SensingflowOutPort"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		SensingflowOutPort sensingflowOutPort = (SensingflowOutPort)object;
		return getString("_UI_SensingflowOutPort_type") + " " + sensingflowOutPort.getId();
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(SensingflowOutPort.class)) {
			case SensingflowPackage.SENSINGFLOW_OUT_PORT__OUTPUT_SIZE:
			case SensingflowPackage.SENSINGFLOW_OUT_PORT__FRAME_SIZE:
			case SensingflowPackage.SENSINGFLOW_OUT_PORT__SUB_FRAME_SIZE:
			case SensingflowPackage.SENSINGFLOW_OUT_PORT__SUB_FRAME_SLIDING_SIZE:
			case SensingflowPackage.SENSINGFLOW_OUT_PORT__FRAME_INTERVAL:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
