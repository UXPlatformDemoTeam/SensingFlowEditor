/**
 */
package sensingflow.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Task Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see sensingflow.model.SensingflowPackage#getSensingflowTaskType()
 * @model
 * @generated
 */
public enum SensingflowTaskType implements Enumerator {
	/**
	 * The '<em><b>Default Task</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEFAULT_TASK_VALUE
	 * @generated
	 * @ordered
	 */
	DEFAULT_TASK(0, "DefaultTask", "DefaultTask"), /**
	 * The '<em><b>Accel Default</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCEL_DEFAULT_VALUE
	 * @generated
	 * @ordered
	 */
	ACCEL_DEFAULT(1, "AccelDefault", "AccelDefault"), /**
	 * The '<em><b>Arg Max</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARG_MAX_VALUE
	 * @generated
	 * @ordered
	 */
	ARG_MAX(2, "ArgMax", "ArgMax"), /**
	 * The '<em><b>AVERAGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AVERAGE_VALUE
	 * @generated
	 * @ordered
	 */
	AVERAGE(3, "AVERAGE", "AVERAGE"), /**
	 * The '<em><b>AVERAGE VECTOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AVERAGE_VECTOR_VALUE
	 * @generated
	 * @ordered
	 */
	AVERAGE_VECTOR(4, "AVERAGE_VECTOR", "AVERAGE_VECTOR"), /**
	 * The '<em><b>BANDWIDTH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BANDWIDTH_VALUE
	 * @generated
	 * @ordered
	 */
	BANDWIDTH(5, "BANDWIDTH", "BANDWIDTH"), /**
	 * The '<em><b>Bat Phone Place Detection</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BAT_PHONE_PLACE_DETECTION_VALUE
	 * @generated
	 * @ordered
	 */
	BAT_PHONE_PLACE_DETECTION(6, "BatPhonePlaceDetection", "BatPhonePlaceDetection"), /**
	 * The '<em><b>Butterworth Filter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUTTERWORTH_FILTER_VALUE
	 * @generated
	 * @ordered
	 */
	BUTTERWORTH_FILTER(7, "ButterworthFilter", "ButterworthFilter"), /**
	 * The '<em><b>BYPASS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYPASS_VALUE
	 * @generated
	 * @ordered
	 */
	BYPASS(8, "BYPASS", "BYPASS"), /**
	 * The '<em><b>Correlation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CORRELATION_VALUE
	 * @generated
	 * @ordered
	 */
	CORRELATION(9, "Correlation", "Correlation"), /**
	 * The '<em><b>Cross Correlation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CROSS_CORRELATION_VALUE
	 * @generated
	 * @ordered
	 */
	CROSS_CORRELATION(10, "CrossCorrelation", "CrossCorrelation"), /**
	 * The '<em><b>DC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DC_VALUE
	 * @generated
	 * @ordered
	 */
	DC(11, "DC", "DC"), /**
	 * The '<em><b>Decibel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECIBEL_VALUE
	 * @generated
	 * @ordered
	 */
	DECIBEL(12, "Decibel", "Decibel"), /**
	 * The '<em><b>Decision Tree</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECISION_TREE_VALUE
	 * @generated
	 * @ordered
	 */
	DECISION_TREE(13, "DecisionTree", "DecisionTree"), /**
	 * The '<em><b>Demodulation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEMODULATION_VALUE
	 * @generated
	 * @ordered
	 */
	DEMODULATION(14, "Demodulation", "Demodulation"), /**
	 * The '<em><b>Downsampling</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOWNSAMPLING_VALUE
	 * @generated
	 * @ordered
	 */
	DOWNSAMPLING(15, "Downsampling", "Downsampling"), /**
	 * The '<em><b>Energy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENERGY_VALUE
	 * @generated
	 * @ordered
	 */
	ENERGY(16, "Energy", "Energy"), /**
	 * The '<em><b>Entropy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENTROPY_VALUE
	 * @generated
	 * @ordered
	 */
	ENTROPY(17, "Entropy", "Entropy"), /**
	 * The '<em><b>FFT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FFT_VALUE
	 * @generated
	 * @ordered
	 */
	FFT(18, "FFT", "FFT"), /**
	 * The '<em><b>FFTC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FFTC_VALUE
	 * @generated
	 * @ordered
	 */
	FFTC(19, "FFTC", "FFTC"), /**
	 * The '<em><b>FFT Normalized Magnitude</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FFT_NORMALIZED_MAGNITUDE_VALUE
	 * @generated
	 * @ordered
	 */
	FFT_NORMALIZED_MAGNITUDE(20, "FFTNormalizedMagnitude", "FFTNormalizedMagnitude"), /**
	 * The '<em><b>Filter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FILTER_VALUE
	 * @generated
	 * @ordered
	 */
	FILTER(21, "Filter", "Filter"), /**
	 * The '<em><b>GMM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GMM_VALUE
	 * @generated
	 * @ordered
	 */
	GMM(22, "GMM", "GMM"), /**
	 * The '<em><b>HMM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HMM_VALUE
	 * @generated
	 * @ordered
	 */
	HMM(23, "HMM", "HMM"), /**
	 * The '<em><b>Increment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INCREMENT_VALUE
	 * @generated
	 * @ordered
	 */
	INCREMENT(24, "Increment", "Increment"), /**
	 * The '<em><b>LEFR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEFR_VALUE
	 * @generated
	 * @ordered
	 */
	LEFR(25, "LEFR", "LEFR"), /**
	 * The '<em><b>MFCC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MFCC_VALUE
	 * @generated
	 * @ordered
	 */
	MFCC(26, "MFCC", "MFCC"), /**
	 * The '<em><b>MFCC DEMULTIPLEXER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MFCC_DEMULTIPLEXER_VALUE
	 * @generated
	 * @ordered
	 */
	MFCC_DEMULTIPLEXER(27, "MFCC_DEMULTIPLEXER", "MFCC_DEMULTIPLEXER"), /**
	 * The '<em><b>Normalize</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NORMALIZE_VALUE
	 * @generated
	 * @ordered
	 */
	NORMALIZE(28, "Normalize", "Normalize"), /**
	 * The '<em><b>Per Com Complex</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PER_COM_COMPLEX_VALUE
	 * @generated
	 * @ordered
	 */
	PER_COM_COMPLEX(29, "PerCom_Complex", "PerCom_Complex"), /**
	 * The '<em><b>Per Com Simple</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PER_COM_SIMPLE_VALUE
	 * @generated
	 * @ordered
	 */
	PER_COM_SIMPLE(30, "PerCom_Simple", "PerCom_Simple"), /**
	 * The '<em><b>Root Mean Square</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROOT_MEAN_SQUARE_VALUE
	 * @generated
	 * @ordered
	 */
	ROOT_MEAN_SQUARE(31, "RootMeanSquare", "RootMeanSquare"), /**
	 * The '<em><b>Relative Spectral Entropy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RELATIVE_SPECTRAL_ENTROPY_VALUE
	 * @generated
	 * @ordered
	 */
	RELATIVE_SPECTRAL_ENTROPY(32, "RelativeSpectralEntropy", "RelativeSpectralEntropy"), /**
	 * The '<em><b>Raw Delta Integral</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RAW_DELTA_INTEGRAL_VALUE
	 * @generated
	 * @ordered
	 */
	RAW_DELTA_INTEGRAL(33, "RawDeltaIntegral", "RawDeltaIntegral"), /**
	 * The '<em><b>Resampling</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESAMPLING_VALUE
	 * @generated
	 * @ordered
	 */
	RESAMPLING(34, "Resampling", "Resampling"), /**
	 * The '<em><b>Row Percentile</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROW_PERCENTILE_VALUE
	 * @generated
	 * @ordered
	 */
	ROW_PERCENTILE(35, "RowPercentile", "RowPercentile"), /**
	 * The '<em><b>Row Sort</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROW_SORT_VALUE
	 * @generated
	 * @ordered
	 */
	ROW_SORT(36, "RowSort", "RowSort"), /**
	 * The '<em><b>SBuffer Win</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SBUFFER_WIN_VALUE
	 * @generated
	 * @ordered
	 */
	SBUFFER_WIN(37, "SBufferWin", "SBufferWin"), /**
	 * The '<em><b>Spectral Centroid</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPECTRAL_CENTROID_VALUE
	 * @generated
	 * @ordered
	 */
	SPECTRAL_CENTROID(38, "SpectralCentroid", "SpectralCentroid"), /**
	 * The '<em><b>Spectral Flux</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPECTRAL_FLUX_VALUE
	 * @generated
	 * @ordered
	 */
	SPECTRAL_FLUX(39, "SpectralFlux", "SpectralFlux"), /**
	 * The '<em><b>Spectral Rolloff</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPECTRAL_ROLLOFF_VALUE
	 * @generated
	 * @ordered
	 */
	SPECTRAL_ROLLOFF(40, "SpectralRolloff", "SpectralRolloff"), /**
	 * The '<em><b>SWin</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SWIN_VALUE
	 * @generated
	 * @ordered
	 */
	SWIN(41, "SWin", "SWin"), /**
	 * The '<em><b>Segmentor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEGMENTOR_VALUE
	 * @generated
	 * @ordered
	 */
	SEGMENTOR(42, "Segmentor", "Segmentor"), /**
	 * The '<em><b>Smoothing</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SMOOTHING_VALUE
	 * @generated
	 * @ordered
	 */
	SMOOTHING(43, "Smoothing", "Smoothing"), /**
	 * The '<em><b>Sound Admission Control</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOUND_ADMISSION_CONTROL_VALUE
	 * @generated
	 * @ordered
	 */
	SOUND_ADMISSION_CONTROL(44, "SoundAdmissionControl", "SoundAdmissionControl"), /**
	 * The '<em><b>Spectrum</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPECTRUM_VALUE
	 * @generated
	 * @ordered
	 */
	SPECTRUM(45, "Spectrum", "Spectrum"), /**
	 * The '<em><b>Square</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SQUARE_VALUE
	 * @generated
	 * @ordered
	 */
	SQUARE(46, "Square", "Square"), /**
	 * The '<em><b>Sum</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUM_VALUE
	 * @generated
	 * @ordered
	 */
	SUM(47, "Sum", "Sum"), /**
	 * The '<em><b>TWin</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWIN_VALUE
	 * @generated
	 * @ordered
	 */
	TWIN(48, "TWin", "TWin"), /**
	 * The '<em><b>VARIANCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VARIANCE_VALUE
	 * @generated
	 * @ordered
	 */
	VARIANCE(49, "VARIANCE", "VARIANCE"), /**
	 * The '<em><b>Window Function</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WINDOW_FUNCTION_VALUE
	 * @generated
	 * @ordered
	 */
	WINDOW_FUNCTION(50, "WindowFunction", "WindowFunction");

	/**
	 * The '<em><b>Default Task</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Default Task</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEFAULT_TASK
	 * @model name="DefaultTask"
	 * @generated
	 * @ordered
	 */
	public static final int DEFAULT_TASK_VALUE = 0;

	/**
	 * The '<em><b>Accel Default</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Accel Default</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACCEL_DEFAULT
	 * @model name="AccelDefault"
	 * @generated
	 * @ordered
	 */
	public static final int ACCEL_DEFAULT_VALUE = 1;

	/**
	 * The '<em><b>Arg Max</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Arg Max</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ARG_MAX
	 * @model name="ArgMax"
	 * @generated
	 * @ordered
	 */
	public static final int ARG_MAX_VALUE = 2;

	/**
	 * The '<em><b>AVERAGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AVERAGE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AVERAGE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AVERAGE_VALUE = 3;

	/**
	 * The '<em><b>AVERAGE VECTOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AVERAGE VECTOR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AVERAGE_VECTOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AVERAGE_VECTOR_VALUE = 4;

	/**
	 * The '<em><b>BANDWIDTH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BANDWIDTH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BANDWIDTH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BANDWIDTH_VALUE = 5;

	/**
	 * The '<em><b>Bat Phone Place Detection</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bat Phone Place Detection</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BAT_PHONE_PLACE_DETECTION
	 * @model name="BatPhonePlaceDetection"
	 * @generated
	 * @ordered
	 */
	public static final int BAT_PHONE_PLACE_DETECTION_VALUE = 6;

	/**
	 * The '<em><b>Butterworth Filter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Butterworth Filter</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BUTTERWORTH_FILTER
	 * @model name="ButterworthFilter"
	 * @generated
	 * @ordered
	 */
	public static final int BUTTERWORTH_FILTER_VALUE = 7;

	/**
	 * The '<em><b>BYPASS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BYPASS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BYPASS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BYPASS_VALUE = 8;

	/**
	 * The '<em><b>Correlation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Correlation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CORRELATION
	 * @model name="Correlation"
	 * @generated
	 * @ordered
	 */
	public static final int CORRELATION_VALUE = 9;

	/**
	 * The '<em><b>Cross Correlation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cross Correlation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CROSS_CORRELATION
	 * @model name="CrossCorrelation"
	 * @generated
	 * @ordered
	 */
	public static final int CROSS_CORRELATION_VALUE = 10;

	/**
	 * The '<em><b>DC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DC_VALUE = 11;

	/**
	 * The '<em><b>Decibel</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Decibel</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DECIBEL
	 * @model name="Decibel"
	 * @generated
	 * @ordered
	 */
	public static final int DECIBEL_VALUE = 12;

	/**
	 * The '<em><b>Decision Tree</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Decision Tree</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DECISION_TREE
	 * @model name="DecisionTree"
	 * @generated
	 * @ordered
	 */
	public static final int DECISION_TREE_VALUE = 13;

	/**
	 * The '<em><b>Demodulation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Demodulation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEMODULATION
	 * @model name="Demodulation"
	 * @generated
	 * @ordered
	 */
	public static final int DEMODULATION_VALUE = 14;

	/**
	 * The '<em><b>Downsampling</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Downsampling</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOWNSAMPLING
	 * @model name="Downsampling"
	 * @generated
	 * @ordered
	 */
	public static final int DOWNSAMPLING_VALUE = 15;

	/**
	 * The '<em><b>Energy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Energy</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENERGY
	 * @model name="Energy"
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_VALUE = 16;

	/**
	 * The '<em><b>Entropy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Entropy</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENTROPY
	 * @model name="Entropy"
	 * @generated
	 * @ordered
	 */
	public static final int ENTROPY_VALUE = 17;

	/**
	 * The '<em><b>FFT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FFT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FFT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FFT_VALUE = 18;

	/**
	 * The '<em><b>FFTC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FFTC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FFTC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FFTC_VALUE = 19;

	/**
	 * The '<em><b>FFT Normalized Magnitude</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FFT Normalized Magnitude</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FFT_NORMALIZED_MAGNITUDE
	 * @model name="FFTNormalizedMagnitude"
	 * @generated
	 * @ordered
	 */
	public static final int FFT_NORMALIZED_MAGNITUDE_VALUE = 20;

	/**
	 * The '<em><b>Filter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Filter</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FILTER
	 * @model name="Filter"
	 * @generated
	 * @ordered
	 */
	public static final int FILTER_VALUE = 21;

	/**
	 * The '<em><b>GMM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GMM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GMM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GMM_VALUE = 22;

	/**
	 * The '<em><b>HMM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HMM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HMM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HMM_VALUE = 23;

	/**
	 * The '<em><b>Increment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Increment</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INCREMENT
	 * @model name="Increment"
	 * @generated
	 * @ordered
	 */
	public static final int INCREMENT_VALUE = 24;

	/**
	 * The '<em><b>LEFR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LEFR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LEFR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LEFR_VALUE = 25;

	/**
	 * The '<em><b>MFCC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MFCC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MFCC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MFCC_VALUE = 26;

	/**
	 * The '<em><b>MFCC DEMULTIPLEXER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MFCC DEMULTIPLEXER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MFCC_DEMULTIPLEXER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MFCC_DEMULTIPLEXER_VALUE = 27;

	/**
	 * The '<em><b>Normalize</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Normalize</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NORMALIZE
	 * @model name="Normalize"
	 * @generated
	 * @ordered
	 */
	public static final int NORMALIZE_VALUE = 28;

	/**
	 * The '<em><b>Per Com Complex</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Per Com Complex</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PER_COM_COMPLEX
	 * @model name="PerCom_Complex"
	 * @generated
	 * @ordered
	 */
	public static final int PER_COM_COMPLEX_VALUE = 29;

	/**
	 * The '<em><b>Per Com Simple</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Per Com Simple</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PER_COM_SIMPLE
	 * @model name="PerCom_Simple"
	 * @generated
	 * @ordered
	 */
	public static final int PER_COM_SIMPLE_VALUE = 30;

	/**
	 * The '<em><b>Root Mean Square</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Root Mean Square</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ROOT_MEAN_SQUARE
	 * @model name="RootMeanSquare"
	 * @generated
	 * @ordered
	 */
	public static final int ROOT_MEAN_SQUARE_VALUE = 31;

	/**
	 * The '<em><b>Relative Spectral Entropy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Relative Spectral Entropy</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RELATIVE_SPECTRAL_ENTROPY
	 * @model name="RelativeSpectralEntropy"
	 * @generated
	 * @ordered
	 */
	public static final int RELATIVE_SPECTRAL_ENTROPY_VALUE = 32;

	/**
	 * The '<em><b>Raw Delta Integral</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Raw Delta Integral</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RAW_DELTA_INTEGRAL
	 * @model name="RawDeltaIntegral"
	 * @generated
	 * @ordered
	 */
	public static final int RAW_DELTA_INTEGRAL_VALUE = 33;

	/**
	 * The '<em><b>Resampling</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Resampling</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESAMPLING
	 * @model name="Resampling"
	 * @generated
	 * @ordered
	 */
	public static final int RESAMPLING_VALUE = 34;

	/**
	 * The '<em><b>Row Percentile</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Row Percentile</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ROW_PERCENTILE
	 * @model name="RowPercentile"
	 * @generated
	 * @ordered
	 */
	public static final int ROW_PERCENTILE_VALUE = 35;

	/**
	 * The '<em><b>Row Sort</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Row Sort</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ROW_SORT
	 * @model name="RowSort"
	 * @generated
	 * @ordered
	 */
	public static final int ROW_SORT_VALUE = 36;

	/**
	 * The '<em><b>SBuffer Win</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SBuffer Win</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SBUFFER_WIN
	 * @model name="SBufferWin"
	 * @generated
	 * @ordered
	 */
	public static final int SBUFFER_WIN_VALUE = 37;

	/**
	 * The '<em><b>Spectral Centroid</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Spectral Centroid</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPECTRAL_CENTROID
	 * @model name="SpectralCentroid"
	 * @generated
	 * @ordered
	 */
	public static final int SPECTRAL_CENTROID_VALUE = 38;

	/**
	 * The '<em><b>Spectral Flux</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Spectral Flux</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPECTRAL_FLUX
	 * @model name="SpectralFlux"
	 * @generated
	 * @ordered
	 */
	public static final int SPECTRAL_FLUX_VALUE = 39;

	/**
	 * The '<em><b>Spectral Rolloff</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Spectral Rolloff</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPECTRAL_ROLLOFF
	 * @model name="SpectralRolloff"
	 * @generated
	 * @ordered
	 */
	public static final int SPECTRAL_ROLLOFF_VALUE = 40;

	/**
	 * The '<em><b>SWin</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SWin</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SWIN
	 * @model name="SWin"
	 * @generated
	 * @ordered
	 */
	public static final int SWIN_VALUE = 41;

	/**
	 * The '<em><b>Segmentor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Segmentor</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SEGMENTOR
	 * @model name="Segmentor"
	 * @generated
	 * @ordered
	 */
	public static final int SEGMENTOR_VALUE = 42;

	/**
	 * The '<em><b>Smoothing</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Smoothing</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SMOOTHING
	 * @model name="Smoothing"
	 * @generated
	 * @ordered
	 */
	public static final int SMOOTHING_VALUE = 43;

	/**
	 * The '<em><b>Sound Admission Control</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sound Admission Control</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOUND_ADMISSION_CONTROL
	 * @model name="SoundAdmissionControl"
	 * @generated
	 * @ordered
	 */
	public static final int SOUND_ADMISSION_CONTROL_VALUE = 44;

	/**
	 * The '<em><b>Spectrum</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Spectrum</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPECTRUM
	 * @model name="Spectrum"
	 * @generated
	 * @ordered
	 */
	public static final int SPECTRUM_VALUE = 45;

	/**
	 * The '<em><b>Square</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Square</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SQUARE
	 * @model name="Square"
	 * @generated
	 * @ordered
	 */
	public static final int SQUARE_VALUE = 46;

	/**
	 * The '<em><b>Sum</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sum</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUM
	 * @model name="Sum"
	 * @generated
	 * @ordered
	 */
	public static final int SUM_VALUE = 47;

	/**
	 * The '<em><b>TWin</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TWin</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TWIN
	 * @model name="TWin"
	 * @generated
	 * @ordered
	 */
	public static final int TWIN_VALUE = 48;

	/**
	 * The '<em><b>VARIANCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VARIANCE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VARIANCE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VARIANCE_VALUE = 49;

	/**
	 * The '<em><b>Window Function</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Window Function</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WINDOW_FUNCTION
	 * @model name="WindowFunction"
	 * @generated
	 * @ordered
	 */
	public static final int WINDOW_FUNCTION_VALUE = 50;

	/**
	 * An array of all the '<em><b>Task Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SensingflowTaskType[] VALUES_ARRAY =
		new SensingflowTaskType[] {
			DEFAULT_TASK,
			ACCEL_DEFAULT,
			ARG_MAX,
			AVERAGE,
			AVERAGE_VECTOR,
			BANDWIDTH,
			BAT_PHONE_PLACE_DETECTION,
			BUTTERWORTH_FILTER,
			BYPASS,
			CORRELATION,
			CROSS_CORRELATION,
			DC,
			DECIBEL,
			DECISION_TREE,
			DEMODULATION,
			DOWNSAMPLING,
			ENERGY,
			ENTROPY,
			FFT,
			FFTC,
			FFT_NORMALIZED_MAGNITUDE,
			FILTER,
			GMM,
			HMM,
			INCREMENT,
			LEFR,
			MFCC,
			MFCC_DEMULTIPLEXER,
			NORMALIZE,
			PER_COM_COMPLEX,
			PER_COM_SIMPLE,
			ROOT_MEAN_SQUARE,
			RELATIVE_SPECTRAL_ENTROPY,
			RAW_DELTA_INTEGRAL,
			RESAMPLING,
			ROW_PERCENTILE,
			ROW_SORT,
			SBUFFER_WIN,
			SPECTRAL_CENTROID,
			SPECTRAL_FLUX,
			SPECTRAL_ROLLOFF,
			SWIN,
			SEGMENTOR,
			SMOOTHING,
			SOUND_ADMISSION_CONTROL,
			SPECTRUM,
			SQUARE,
			SUM,
			TWIN,
			VARIANCE,
			WINDOW_FUNCTION,
		};

	/**
	 * A public read-only list of all the '<em><b>Task Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SensingflowTaskType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Task Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SensingflowTaskType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SensingflowTaskType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Task Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SensingflowTaskType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SensingflowTaskType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Task Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SensingflowTaskType get(int value) {
		switch (value) {
			case DEFAULT_TASK_VALUE: return DEFAULT_TASK;
			case ACCEL_DEFAULT_VALUE: return ACCEL_DEFAULT;
			case ARG_MAX_VALUE: return ARG_MAX;
			case AVERAGE_VALUE: return AVERAGE;
			case AVERAGE_VECTOR_VALUE: return AVERAGE_VECTOR;
			case BANDWIDTH_VALUE: return BANDWIDTH;
			case BAT_PHONE_PLACE_DETECTION_VALUE: return BAT_PHONE_PLACE_DETECTION;
			case BUTTERWORTH_FILTER_VALUE: return BUTTERWORTH_FILTER;
			case BYPASS_VALUE: return BYPASS;
			case CORRELATION_VALUE: return CORRELATION;
			case CROSS_CORRELATION_VALUE: return CROSS_CORRELATION;
			case DC_VALUE: return DC;
			case DECIBEL_VALUE: return DECIBEL;
			case DECISION_TREE_VALUE: return DECISION_TREE;
			case DEMODULATION_VALUE: return DEMODULATION;
			case DOWNSAMPLING_VALUE: return DOWNSAMPLING;
			case ENERGY_VALUE: return ENERGY;
			case ENTROPY_VALUE: return ENTROPY;
			case FFT_VALUE: return FFT;
			case FFTC_VALUE: return FFTC;
			case FFT_NORMALIZED_MAGNITUDE_VALUE: return FFT_NORMALIZED_MAGNITUDE;
			case FILTER_VALUE: return FILTER;
			case GMM_VALUE: return GMM;
			case HMM_VALUE: return HMM;
			case INCREMENT_VALUE: return INCREMENT;
			case LEFR_VALUE: return LEFR;
			case MFCC_VALUE: return MFCC;
			case MFCC_DEMULTIPLEXER_VALUE: return MFCC_DEMULTIPLEXER;
			case NORMALIZE_VALUE: return NORMALIZE;
			case PER_COM_COMPLEX_VALUE: return PER_COM_COMPLEX;
			case PER_COM_SIMPLE_VALUE: return PER_COM_SIMPLE;
			case ROOT_MEAN_SQUARE_VALUE: return ROOT_MEAN_SQUARE;
			case RELATIVE_SPECTRAL_ENTROPY_VALUE: return RELATIVE_SPECTRAL_ENTROPY;
			case RAW_DELTA_INTEGRAL_VALUE: return RAW_DELTA_INTEGRAL;
			case RESAMPLING_VALUE: return RESAMPLING;
			case ROW_PERCENTILE_VALUE: return ROW_PERCENTILE;
			case ROW_SORT_VALUE: return ROW_SORT;
			case SBUFFER_WIN_VALUE: return SBUFFER_WIN;
			case SPECTRAL_CENTROID_VALUE: return SPECTRAL_CENTROID;
			case SPECTRAL_FLUX_VALUE: return SPECTRAL_FLUX;
			case SPECTRAL_ROLLOFF_VALUE: return SPECTRAL_ROLLOFF;
			case SWIN_VALUE: return SWIN;
			case SEGMENTOR_VALUE: return SEGMENTOR;
			case SMOOTHING_VALUE: return SMOOTHING;
			case SOUND_ADMISSION_CONTROL_VALUE: return SOUND_ADMISSION_CONTROL;
			case SPECTRUM_VALUE: return SPECTRUM;
			case SQUARE_VALUE: return SQUARE;
			case SUM_VALUE: return SUM;
			case TWIN_VALUE: return TWIN;
			case VARIANCE_VALUE: return VARIANCE;
			case WINDOW_FUNCTION_VALUE: return WINDOW_FUNCTION;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private SensingflowTaskType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //SensingflowTaskType
